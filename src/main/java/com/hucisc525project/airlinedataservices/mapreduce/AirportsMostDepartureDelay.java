package com.hucisc525project.airlinedataservices.mapreduce;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;


public class AirportsMostDepartureDelay {
	
	public static void main(String[] args) throws Exception {
		Job job = Job.getInstance();
		job.setJarByClass(AirportsMostDepartureDelay.class);
		job.setJobName("AirportsMostDepartureDelay");

		TextInputFormat.addInputPath(job, new Path(args[0]));
		job.setInputFormatClass(TextInputFormat.class);

		job.setMapperClass(AirportsMostDepartureDelayMapper.class);
		job.setReducerClass(AirportsMostDepartureDelayReducer.class);

		TextOutputFormat.setOutputPath(job, new Path(args[1]));
		job.setOutputFormatClass(TextOutputFormat.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);

		job.waitForCompletion(true);
	}

}
