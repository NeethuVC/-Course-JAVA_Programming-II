
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    public int hashCode() {
        if(this.year==0 || this.month==0 || this.day==0){
             return this.hashCode();
            
        }
        else{
            
           if(this.year>=1900 && this.year<=2100){
                int hash = 17;
                hash = hash * 31 + this.day;
                hash = hash * 31 + this.month;
                hash = hash * 31 + this.year;
                return hash;
           }else{
                return this.year+this.month+this.day;
           }
          
        }
            
        
        
    }
}
