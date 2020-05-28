public class Container {    //Outer Class
    // Constructor for the container
    // Container(){}

    public int i = 6;

    // InnerClass
    private class Content{
        public void print(){
            System.out.println("This Is Inner Class");
        }
    }

    // Accessing the Inner class
    public void printContent(){
        Content newContent = new Content(); // Because our Content was private the inner class need to be access from the outer class
        newContent.print();
    }

    // Function to for the Anonymous function
    public void print(){
        System.out.println("This is a print from the outside of the main class");
    }
}
