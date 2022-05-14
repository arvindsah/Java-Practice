package com.x.qa.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'smallestNegativeBalance' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_STRING_ARRAY debts as parameter.
     */

    public static List<String> smallestNegativeBalance(List<List<String>> debts) {
    // Write your code here7
    
    Set<String> names=new HashSet<>();
    Map<String,Integer> map = new HashMap<>();
    
    for (int i=0; i<debts.size();i++ ){
        for  (int j=0; j<debts.get(0).size()-1;j++ ){
            names.add(debts.get(i).get(j));
    }
    }
    System.out.println("names  - " + names);
    
    for (String name:names ){
     for (int i=0; i<debts.size();i++ ){
        for  (int j=0; j<debts.get(0).size()-1;j++ ){
            
            if (name== debts.get(i).get(j)){
                if(j==0)
                {
                   map.put(name,map.get(name)-Integer.parseInt(debts.get(i).get(2))) ;
                }
                else {
                   map.put(name,map.get(name)+Integer.parseInt(debts.get(i).get(2))) ;
                }
        
            }
        }
    }
    }
    
    String[] returnString= new String[]{
        "Nobody has a negative balance"
    };
    
    List<String> newList= new ArrayList();
    //Entry<String,Integer> entry=map.entrySet();
    
    Map<String, Integer> sorted = map .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                 (e1, e2)          ->               e1, LinkedHashMap::new));

    for(Map.Entry<String,Integer> entry:sorted.entrySet())
    {
        if(entry.getValue()<0){
            
            //newList.add(entry.getKey());
        }
        else{
            sorted.remove(entry.getKey());
        }
    }
    int lastValue=0;
    for (Map.Entry<String,Integer> entry:sorted.entrySet()) {
        
        if(entry.getValue()==lastValue)
        {
            
            newList.add(entry.getKey());
        }
        
        else
        break;
        lastValue=entry.getValue();
    }
    Collections.sort(newList);
    if(newList.size()==0)
        return Arrays.asList(returnString);
    
    return newList;

}
}


public class FindNegativeOfBorrower {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int debtsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int debtsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> debts = new ArrayList<>();

        IntStream.range(0, debtsRows).forEach(i -> {
            try {
                debts.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<String> result = Result.smallestNegativeBalance(debts);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
