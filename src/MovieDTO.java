public class MovieDTO {
    private String title;
    private String major;
    private int runningTime;
    private float rating;
    private String genre;

    public MovieDTO(String title, String major, int runningTime, float rating, String genre) {
        this.title = title;
        this.major = major;
        this.runningTime = runningTime;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getMajor() {
        return major;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public float getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", major='" + major + '\'' +
                ", runningTime=" + runningTime +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
