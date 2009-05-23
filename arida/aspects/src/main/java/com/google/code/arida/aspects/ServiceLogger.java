/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009  Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.google.code.arida.aspects;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * An aspect for logging access to/from services
 * 
 * @author kaeto23
 * 
 */
@Aspect
public class ServiceLogger {
	/**
	 * A logger
	 */
	private static final transient Logger log = Logger
			.getLogger(ServiceLogger.class.getName());

	/**
	 * the aspect method for logging access to the services
	 * 
	 * @param p
	 *            the join point
	 * @return the result of the service
	 * @throws Throwable
	 *             if the service throws an exception
	 */
	@Around("execution(* ds2.arida.common.api.*Service.*(..))")
	public Object logAccess(ProceedingJoinPoint p) throws Throwable {
		Object rc = null;
		Signature s = p.getSignature();
		String methodName = s.getName();
		String accessedClass = s.getDeclaringTypeName();
		if (log.isLoggable(Level.FINER)) {
			StringBuffer sb = new StringBuffer("");
			sb.append("method=").append(s.getName());
			sb.append("(");
			Object[] args = p.getArgs();
			if (args != null && args.length > 0) {
				for (Object arg : args) {
					sb.append(arg);
					sb.append(",");
				}
			}
			sb.append(")");
			log.entering(accessedClass, methodName, sb.toString());
		}
		try {
			rc = p.proceed();
		} catch (Throwable e) {
			log.warning("Exception will be thrown with message: "
					+ e.getLocalizedMessage());
			throw e;
		}
		if (log.isLoggable(Level.FINER)) {
			log.exiting(accessedClass, methodName, "rc=" + rc);
		}
		return rc;
	}

}
