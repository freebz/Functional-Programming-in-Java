// designing/fpij/MailerBuilder.java

new MailBuilder()
  .from("build@agiledeveloper.com")
  .to("venkats@agiledeveloper.com")
  .subject("build notification")
  .body("...it sucks less...")
  .send();
