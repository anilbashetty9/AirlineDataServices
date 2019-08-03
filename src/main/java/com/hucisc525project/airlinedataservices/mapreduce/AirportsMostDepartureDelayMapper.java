package com.hucisc525project.airlinedataservices.mapreduce;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import au.com.bytecode.opencsv.CSVParser;
/**
 * @author Anil Bashetty
 *
 * 
 */
public class AirportsMostDepartureDelayMapper extends Mapper<Object, Text, Text, Text> {
	@Override
	protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
		String[] parts = new CSVParser().parseLine(value.toString());
		//String record = value.toString();
		//String[] parts = record.split(",");
		context.write(new Text(parts[16]), new Text(parts[15])); //16 - origin IATA airport code 15 - departure delay in minutes
		
	}
}
