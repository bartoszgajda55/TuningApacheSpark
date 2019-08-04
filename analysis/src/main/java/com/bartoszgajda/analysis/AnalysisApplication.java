package com.bartoszgajda.analysis;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class AnalysisApplication {

  private static final String APPLICATION_NAME = "Analysis Tier";
  private static final String HADOOP_HOME_DIR_VALUE = "C:/winutils";
  private static final String RUN_LOCAL_WITH_AVAILABLE_CORES = "local[*]";

  public static void main(String[] args) throws InterruptedException {

    System.setProperty("hadoop.home.dir", HADOOP_HOME_DIR_VALUE);

    final SparkConf conf = new SparkConf()
      .setAppName(APPLICATION_NAME)
      .setMaster(RUN_LOCAL_WITH_AVAILABLE_CORES);

    JavaSparkContext sparkContext = new JavaSparkContext(conf);

    // business logic

    sparkContext.stop();
    sparkContext.close();
  }
}
