public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String news) {
        if (name.equals("Newscaster")) {
            System.out.println("Newscaster: Behind the hacking of the PhilHealth system have confirmed that they have sensitive information from the agency after the government did not pay the 300,000 dollars demanded by the group that used the medusa ransomware. The hackers uploaded in the dark web videos and some samples of the documents and information they obtained from PhilHealth including employee's IDs, passports, driver's license, credit cards, and a bunch of 1x1 pictures of random people. Some internal documents of PhilHealth such as employee database, hospital records, phone directory, case records of the agency and others are also on the dark web. Although Philhealth maintained that no membership data was compromised in the hacking that occurred. According to DICT, they cannot retrieve the information from the dark web and it's possible that they have bigger information. Cyber security analyst advices all PhilHealth members and employees should be extra careful.");
        }
    }
}