package fr.unice.miage;
import java.io.File;
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

        public static void main(String[] args) {
            Main m = new Main();

            m.print_directory_contents(".");
        }

    }

