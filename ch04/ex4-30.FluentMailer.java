// designing/fpij/FluentMailer.java

FluentMailer.send(mailer ->
  mailer.from("build@agiledeveloper.com")
	.to("venkats@agiledeveloper.com")
	.subject("build notification")
	.body("...much better..."));
