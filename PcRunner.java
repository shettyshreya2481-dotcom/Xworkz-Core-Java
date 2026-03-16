public class PcRunner {

    public static void main(String[] args) {

        Hardware h1 = new Hardware("Keyboard", "Dell");
        Pc p1 = new Pc("OfficePC", h1);

        Hardware h2 = new Hardware("Mouse", "HP");
        Pc p2 = new Pc("GamingPC", h2);

        Hardware h3 = new Hardware("Monitor", "Samsung");
        Pc p3 = new Pc("HomePC", h3);

        Hardware h4 = new Hardware("RAM", "Corsair");
        Pc p4 = new Pc("WorkPC", h4);

        Hardware h5 = new Hardware("SSD", "WD");
        Pc p5 = new Pc("ServerPC", h5);

        Hardware h6 = new Hardware("GPU", "Nvidia");
        Pc p6 = new Pc("EditingPC", h6);

        Hardware h7 = new Hardware("CPU", "Intel");
        Pc p7 = new Pc("StudentPC", h7);

        Hardware h8 = new Hardware("Motherboard", "Asus");
        Pc p8 = new Pc("LabPC", h8);

        Hardware h9 = new Hardware("Speaker", "Logitech");
        Pc p9 = new Pc("MediaPC", h9);

        Hardware h10 = new Hardware("Webcam", "HP");
        Pc p10 = new Pc("MeetingPC", h10);

        Hardware h11 = new Hardware("Keyboard", "Lenovo");
        Pc p11 = new Pc("OfficePC2", h11);

        Hardware h12 = new Hardware("Mouse", "Dell");
        Pc p12 = new Pc("GamingPC2", h12);

        Hardware h13 = new Hardware("Monitor", "LG");
        Pc p13 = new Pc("HomePC2", h13);

        Hardware h14 = new Hardware("RAM", "Kingston");
        Pc p14 = new Pc("WorkPC2", h14);

        Hardware h15 = new Hardware("SSD", "Samsung");
        Pc p15 = new Pc("ServerPC2", h15);

        Hardware h16 = new Hardware("GPU", "AMD");
        Pc p16 = new Pc("EditingPC2", h16);

        Hardware h17 = new Hardware("CPU", "Ryzen");
        Pc p17 = new Pc("StudentPC2", h17);

        Hardware h18 = new Hardware("Motherboard", "Gigabyte");
        Pc p18 = new Pc("LabPC2", h18);

        Hardware h19 = new Hardware("Speaker", "Sony");
        Pc p19 = new Pc("MediaPC2", h19);

        Hardware h20 = new Hardware("Webcam", "Logitech");
        Pc p20 = new Pc("MeetingPC2", h20);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
        p7.display();
        p8.display();
        p9.display();
        p10.display();
        p11.display();
        p12.display();
        p13.display();
        p14.display();
        p15.display();
        p16.display();
        p17.display();
        p18.display();
        p19.display();
        p20.display();
    }
}