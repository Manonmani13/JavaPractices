class CFG{
  
    // The method that calls the main() method
    static void mainCaller()
    {
        System.out.println("mainCaller!");
  
        // Calling the main() method
        main();
    }
  
    // main() method
    public static void main(String[] args)
    {
        System.out.println("main");
  
        // Calling the mainCalller() method
        // so that main() methiod is called externally
        mainCaller();
    }
}
