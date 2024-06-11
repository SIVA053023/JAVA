public class One{
    public static void main(String[] args){
        String[] strings= {"java","python","jaavscript","HTML"};  // output= java_python_jaavscript_HTML
        String languages= String.join("_",strings);
        System.out.println(languages);
    }
}