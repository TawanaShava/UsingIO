package com.company;

import java.io.*;

class DataManagement{
    String TawanaShava56415 ;
    void ReadDataShava56415() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Please Input Your Full Name");
        TawanaShava56415=tv.readLine();
    }
    void WriteDataToShava56415File(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(TawanaShava56415);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void readDataViaShava56415File(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("task4.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataViaShava56415File();
        obj.WriteDataToShava56415File();
        System.out.println();
        obj.ReadDataShava56415();
    }

}
