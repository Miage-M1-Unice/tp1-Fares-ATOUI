package fr.unice.miage;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.String;



    public class Main {

        private void print_directory_contents(String path){

            File f = new File(path);

            if (f.isDirectory()){
                for(File file: f.listFiles()){

                    print_directory_contents(file.getPath());

                }

                }else{
                System.out.println("[" + f.getPath() + "]");
            }

        }

       private void filter(String path, String ext) {
           File f = new File(path);

           FilenameFilter textFilter = new FilenameFilter() {

               public boolean accept(File dir, String name) {

                   String lowercaseName = name.toLowerCase();
                   if (lowercaseName.endsWith(ext) ) {
                       return true;
                   } else{
                       return false;
                   }
               }
           };

           if (f.isDirectory()) {
               for (File files: f.listFiles()) {

                  filter(files.getPath(), ext);
               }
           } else {

               if (textFilter.accept(f, f.getName())) {
                   System.out.println("[ " + f.getPath() + " ]");
               }
           }
       }


        public static void main(String[] args) {
            Main m = new Main();
            System.out.println(" ");


          //  m.print_directory_contents(".");

            m.filter(".", ".java");


        }

    }

