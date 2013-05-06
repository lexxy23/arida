/**
 * 
 */
package ds2.arida.persistence.impl.jpa.test;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.formatter.Formatters;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.dto.AccountXml;
import com.google.code.arida.common.api.exceptions.AridaException;

import ds2.arida.persistence.api.AccountPersistence;
import ds2.oss.core.api.EntryStates;

/**
 * Persistence test.
 * 
 * @author dstrauss
 * @version 0.1
 */
public class PersistenceIT extends Arquillian {
    /**
     * A logger.
     */
    private static final Logger LOG = LoggerFactory
        .getLogger(PersistenceIT.class);
    /**
     * The test object.
     */
    @Inject
    private AccountPersistence to;
    
    /**
     * Inits the test.
     */
    public PersistenceIT() {
        // TODO Auto-generated constructor stub
    }
    
    @Deployment
    public static JavaArchive createTestableDeployment() {
        final JavaArchive jar =
            ShrinkWrap
                .create(JavaArchive.class, "example.jar")
                .addPackages(true, "ds2.arida.persistence")
                .addAsManifestResource("test-persistence.xml",
                    "persistence.xml")
                // Enable CDI
                .addAsManifestResource(EmptyAsset.INSTANCE,
                    ArchivePaths.create("beans.xml"));
        
        LOG.info(jar.toString(Formatters.VERBOSE));
        return jar;
    }
    
    @Test
    public void create1() throws AridaException {
        AccountXml a = new AccountXml();
        a.setEntryState(EntryStates.ACTIVE);
        a.setOpenId("myOpenId");
        Account rc = to.create(a);
        LOG.info("Created: {}", rc);
        Assert.assertNotNull(rc);
    }
}
