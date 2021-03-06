package com.clearurdoubt

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, explode, split}

object SparkSqlWordCount extends App {
  val spark = SparkSession.builder
    .appName("Spark SQL - DataFrame Demo")
    .master("local[*]")
    .getOrCreate()

  val df = spark.read.text("src/main/resources/README.md")

  val wordsDf = df.select(
    explode(
      split(
        str = col("value"),
        pattern = " "
      )
    ).as("words")
  )

  wordsDf.show(truncate = false)

  val countsDf = wordsDf.groupBy("words").count()
  countsDf.show(truncate = false)

  countsDf.coalesce(1).write
    .format("csv")
    .save("target/word_counts")
}
