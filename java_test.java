// 2022-12-08

// Caused by: java.time.format.DateTimeParseException:
// Text '2022.12' could not be parsed: Unable to obtain LocalDate from TemporalAccessor:
// {Year=2022, MonthOfYear=12},ISO of type java.time.format.Parsed

String str = "2022.12";
String[] split = str.split("\\.")
int year = split[0];
int month = split[1];
// LocalDate parse = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy.MM"));
System.out.println("parse = " + parse);


String str = null;
// Exception in thread "main" java.lang.NullPointerException
// Cause str.isEmpty()
if(str != null || str.isEmpty()){
  System.out.println("str is null or empty");
}
