public enum Language {

    ENGLISH("Hello"),
    VIETNAMESE("Xin chao");

    private final String greeting;

    Language(String greeting) {
        this.greeting = greeting;
    }

    public void sayHello() {
        System.out.println(greeting);
    }
}
