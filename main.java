public class main {
  static void say() { 
    System.out.println("main"); 
  }

  public static void main(String[] args) {
  say();
  Hello hello = new Hello();
  hello.say("hello world");
  }

}
