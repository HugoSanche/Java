class Movie{
    private String name;
    private String format;
    private double rating;



    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }
    public Movie(Movie sources){
        this.name=sources.name;
        this.format=sources.format;
        this.rating=sources.rating;
    }
    @Override
    public String toString(){
        return +this.rating+"\t"+this.format+"  "+this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name==null || name.isBlank()){
            throw new IllegalArgumentException("Ilegal name");
            
        }else{
            this.name = name;
        }
      
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        if (format==null || format.isBlank()){
            throw new IllegalArgumentException("Error in format");
        }else{
            this.format = format;
        }
        
    }

    public double getRating() {

        return this.rating;
    }

    public void setRating(double rating) {
        if (rating <0 || rating>10){
            throw new IllegalArgumentException("Argument between 0 and 10");
        }
        this.rating = rating;

    }

}