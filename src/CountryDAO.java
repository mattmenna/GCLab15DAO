public interface CountryDAO {

    public int FILE_DAO = 1;
    public int JDBC_DAO = 2;

    public void addCountry(Country country);
    public void deleteCountry(Country country);
    public void updateCountry(COuntry country);

}
