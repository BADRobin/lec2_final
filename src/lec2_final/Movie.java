package lec2_final;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;

    private MovieType _type;

    public Movie(String title, int type) {
        _title = title;
        _type = type;
    }
    public int getPriceCode() {
        return _type;
    }
    public void setPriceCode(int arg) {
        _type = arg;
    }
    public String getTitle() {
        return _title;
    }
    public double rentalCost(int daysRented){

//        switch (getPriceCode()) {
//            case Movie.REGULAR:
//                result += 2;
//                if (daysRented > 2) {
//                    result += (daysRented - 2) * 1.5;
//                }
//                break;
//            case Movie.NEW_RELEASE:
//                result += daysRented * 3;
//                break;
//            case Movie.CHILDRENS:
//                result += 1.5;
//                if (daysRented > 3) {
//                    result += (daysRented - 3) * 1.5;
//                }
//                break;
//        }
        return result;
    }
    int rentalPoints(int daysRented) {


        return getT;
    }

}
