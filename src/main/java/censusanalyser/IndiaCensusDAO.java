package censusanalyser;

public class IndiaCensusDAO {
    private String state;
    private int areaInSqKm;
    private int densityPerSqKm;
    private int population;

    public IndiaCensusDAO(IndiaCensusCSV indiaCensusCSV) {
        state = indiaCensusCSV.state;
        areaInSqKm = indiaCensusCSV.areaInSqKm;
        densityPerSqKm = indiaCensusCSV.densityPerSqKm;
        population = indiaCensusCSV.population;
    }
}
