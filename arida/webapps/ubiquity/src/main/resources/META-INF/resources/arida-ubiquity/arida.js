/*
 * Arida Raid and Clan Management
 * Copyright (C) 2009,2010  Dirk Strauss
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
CmdUtils
		.CreateCommand( {
			name : "date",

			_date : function() {
				var date = new Date();
				return date.toLocaleDateString();
			},

			preview : function(pblock) {
				var msg = 'Inserts todays date: "<i>${date}</i>"';
				pblock.innerHTML = CmdUtils.renderTemplate(msg, {
					date : this._date()
				});
			},
			homepage : "http://localhost:8080/ubiquity/",
			author : {
				name : "Test User",
				email : "test@user.com"
			},
			contributors : [ "D. Strauss" ],
			license : "MPL",
			description : "Inserts today's date.",
			help : "If you're in an editable text area, inserts today's date, formatted for the current locale.",

			execute : function() {
				CmdUtils.setSelection(this._date());
				displayMessage("Date hinzugefuegt");

			}
		})

CmdUtils.CreateCommand( {
	name : "echo",
	takes : {
		"your shout" : noun_arb_text
	},
	preview : function(pblock, theShout) {
		pblock.innerHTML = "Will echo: " + theShout.text;
	},
	execute : function(theShout) {
		var msg = theShout.text + "... " + theShout.text + "......";
		displayMessage(msg);
	}
});

CmdUtils.CreateCommand( {
	name : "digits",
	takes : {
		"some digits" : /[0-9]+/
	},
	execute : function(digits) {
		displayMessage("You entered " + digits.text);
	}
});

noun_type_color = new CmdUtils.NounType("Color", [ "red", "orange", "yellow",
		"green", "blue", "violet", "black", "white", "grey", "brown", "beige",
		"magenta", "cerulean", "puce" ] // etc...
);

CmdUtils.CreateCommand( {
	name : "get-color-code",
	takes : {
		"color" : noun_type_color
	},
	preview : "Inserts the HTML hex-code for the given color.",
	execute : function(d) {
		displayMessage("Blaaa " + d.text);
	}
});

var noun_type_freebase_topic = {
	_name : "Freebase topic",

	suggest : function suggest(text, html, callback) {
		jQuery.ajax( {
			url : "http://www.freebase.com/api/service/search",
			dataType : "json",
			data : {
				prefix : text,
				limit : 5
			},
			success : function suggestTopics(response) {
				var i, results, result;
				results = response.result;
				for (i = 0; i < results.length; i++) {
					result = results[i];
					callback(CmdUtils
							.makeSugg(result.name, result.name, result));
				}
			}
		});
		return [];
	}
};
CmdUtils
		.CreateCommand( {
			name : "freebase-lookup",
			takes : {
				topic : noun_type_freebase_topic
			},
			preview : function preview(container, topic) {
				var text = topic.text || "any topic";
				container.innerHTML = "Go to the Freebase topic page for "
						+ text + ".";
			},
			execute : function goToFreebase(topic) {
				if (topic) {
					Utils.openUrlInBrowser("http://www.freebase.com/view"
							+ topic.data.id);
				}
			}
		});
