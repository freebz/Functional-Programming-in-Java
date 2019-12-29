// designing/fpij/Mailer.java

Mailer mailer = new Mailer();
mailer.from("build@agiledeveloper.com");
mailer.to("venkats@agiledeveloper.com");
mailer.subject("build notification");
mailer.body("... your code sucks...");
mailer.send();
