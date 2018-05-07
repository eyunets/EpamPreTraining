public class Date {

	public static final int JANUARY = 1;
	public static final int FEBRUARY = 2;
	public static final int MARCH = 3;
	public static final int APRIL = 4;
	public static final int MAY = 5;
	public static final int JUNE = 6;
	public static final int JULY = 7;
	public static final int AUGUST = 8;

	public static final int SEPTEMBER = 9;
	public static final int OCTOBER = 10;
	public static final int NOVEMBER = 11;
	public static final int DECEMBER = 12;
	public static final int LEAP_YEAR_CONST_4 = 4;
	public static final int LEAP_YEAR_CONST_400 = 400;
	public static final int LEAP_YEAR_CONST_100 = 100;
	public static final int LAST_DAY_31 = 31;
	public static final int LAST_DAY_30 = 30;
	public static final int LAST_DAY_28 = 28;
	public static final int LAST_DAY_29 = 29;
	public static final int FIRST_DAY_OF_MONTH = 1;

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date nextDay() {
		int day = this.day;
		int month = this.month;
		int year = this.year;
		if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) {
			if (day < LAST_DAY_30) {
				day += 1;
			} else {
				day = 1;
				month += 1;
			}
		} else if (month == FEBRUARY) {
			if (isLeapYear()) {
				if (day < LAST_DAY_29) {
					day += 1;
				} else {
					day += 1;
					month += 1;
				}
			} else {
				if (day < LAST_DAY_28) {
					day += 1;
				} else {
					day = 1;
					month += 1;
				}
			}
		} else if (month == DECEMBER) {
			if (day < LAST_DAY_31) {
				day += 1;
			} else {
				day = 1;
				month = 1;
				year += 1;
			}
		} else {
			if (day < LAST_DAY_31) {
				day += 1;
			} else {
				day = 1;
				month += 1;
			}
		}
		return new Date(day, month, year);
	}

	public boolean isLeapYear() {
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				return false;
			} else
				return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String(this.day + "." + this.month + "." + this.year);
	}
}
