package utils

object Config {

  // The local directory containing this repository
  /** Change it with the your local path of the directory lab-cse-2025-2026 */
  val projectDir :String = "C:\\Users\\zacca\\Desktop\\MAGISTRALE INFORMATICA\\SECONDO ANNO\\PRIMO SEMESTRE\\Big Data\\Laboratorio\\lab-cse-25-26"
  // The name of the shared bucket on AWS S3 to read datasets (so you don't need to upload them in your bucket)
  val s3sharedBucketName :String = "unibo-bd2526-egallinucci-shared"
  // The name of your bucket on AWS S3
  /** The name must be unique **/
    /** Change this to a new name that you want to give to the bucket that you want to create to AWS **/
  val s3bucketName :String = "unibo-bd2526-mzaccarini"
  // The path to the credentials file for AWS (if you follow instructions, this should not be updated)
  val credentialsPath :String = "/aws_credentials"

}
