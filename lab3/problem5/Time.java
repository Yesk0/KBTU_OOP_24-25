package lab3.problem5;

public class Time implements Comparable<Time>{
	public int hours;
	public int minutes;
	public int seconds;
	
	
	
	public Time(int hours, int minutes, int seconds){
		setValues(hours, minutes, seconds);
		
	}
	
	public void setValues(int hours, int minutes, int seconds) {
		if(hours >= 0 && hours <= 24 && minutes >= 0 && minutes <= 60 && seconds >= 0 && seconds <= 60) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
		else {
			System.out.println("Invalid time format");
			System.exit(seconds);
		}
	}
	
	
	
	public String toUniversal() {
		return hours + ":" + minutes + ":" + seconds;
		
	}
	
	public int totalSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }
	
	
	public String toStandart() {
		if(hours > 12) {
			return hours-12 + ":" + minutes + ":" + seconds + " PM";
		}
		else {
			return hours + ":" + minutes + ":" + seconds + " AM";
		}
		
		
		
	}
	
	public void add(Time other) {
        this.seconds+= other.seconds;
        if (this.seconds >= 60) {
            this.seconds -= 60;
            this.minutes++;
        }

        this.minutes += other.minutes;
        if (this.minutes >= 60) {
            this.minutes -= 60;
            this.hours++;
        }

        this.hours += other.hours;
        if (this.hours >= 24) {
            this.hours -= 24;
        }
    }

	@Override
    public int compareTo(Time other) {
        return Integer.compare(this.totalSeconds(), other.totalSeconds());
    }
	
	@Override
	public String toString() {
	    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

	
}
