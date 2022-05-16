package com.x.qa.test.collection;

	import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;


	class Result {

	    /*
	     * Complete the 'minCost' function below.
	     *
	     * The function is expected to return a LONG_INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER numProjects
	     *  2. INTEGER_ARRAY projectId
	     *  3. INTEGER_ARRAY bid
	     */

	    public static long minCost(int numProjects, List<Integer> projectId, 

	List<Integer> bid) {
	        
	        Set<Integer> set= new HashSet<>(projectId);
	        if(set.size()!=numProjects){
	        return -1l;    
	        }
	        
	        Map<Integer, Integer> map= new HashMap<>();
	        
	        for(Integer key: set ){
	            map.put(key, Integer.MAX_VALUE);
	        }
	        
	        
	        
	        for (int i=0 ; i<projectId.size();i++){
	            if(bid.get(i)< map.get(projectId.get(i)))
	            {
	                map.put(projectId.get(i), bid.get(i));
	            }
	            
	        }
	        
	        long sum=0;
	        
	        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
	            sum=sum+ (long)entry.getValue();
	            
	        }
	        
	        return sum;
	    }

	}
	public class ProjectBidingProcess {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader

	(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter

	(System.getenv("OUTPUT_PATH")));

	        int numProjects = Integer.parseInt(bufferedReader.readLine().trim());

	        int projectIdCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> projectId = IntStream.range(0, projectIdCount).mapToObj(i 

	-> {
	            try {
	                return bufferedReader.readLine().replaceAll("\\s+$", "");
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .map(String::trim)
	            .map(Integer::parseInt)
	            .collect(toList());

	        int bidCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> bid = IntStream.range(0, bidCount).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine().replaceAll("\\s+$", "");
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .map(String::trim)
	            .map(Integer::parseInt)
	            .collect(toList());

	        long result = Result.minCost(numProjects, projectId, bid);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
