// 2022-12-08

// Caused by: java.time.format.DateTimeParseException:
// Text '2022.12' could not be parsed: Unable to obtain LocalDate from TemporalAccessor:
// {Year=2022, MonthOfYear=12},ISO of type java.time.format.Parsed

String str = "2022.12";
LocalDate parse = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy.MM"));
System.out.println("parse = " + parse);
