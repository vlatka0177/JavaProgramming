package OfficeHours.day09.mobileAppTask;

public class MobileApp {

    /*
            appTask:


        Create a class called MobileApp

        Instance variables: name, version

        Add a constructor to set all the fields

        Instance methods: useTheApp(int minutes), download()

        Create the following sub classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)

         */

    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MobileApp(String name, String version) {
        this.name = name;
        this.version = version;
    }
/*
        public void useTheApp(int minutes);
        public void  download(); */
    }

