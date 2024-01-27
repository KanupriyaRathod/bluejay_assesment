/*----------------------------------------------------------------------------------------------
@Author:        	Kanupriya Rathod
@Date:              27-01-2024
@Description:   	Class to store employee collection
----------------------------------------------------------------------------------------------*/
public class Employee_ {
    private String positionID;
    private String timeInDay;
    private String timeOutDay;
    private String employeeName;
    private String fileNumber;
    private String timeHours;

    //created employee_ constructor with parameter positionID,timeInDay,timeOutDay,employeeName,fileNumber,timeHours
    public Employee_(String positionID, String timeInDay, String timeOutDay, String employeeName, String fileNumber,
        String timeHours) {
        this.positionID = positionID;
        this.timeInDay = timeInDay;
        this.timeOutDay = timeOutDay;
        this.employeeName = employeeName;
        this.fileNumber = fileNumber;
        this.timeHours = timeHours;
    }
    //created getters and setters for parameters
    public String getPositionID() {
        return positionID;
    }

    public String getTimeHours() {
        return timeHours;
    }

    public String getTimeInDay() {
        return timeInDay;
    }

    public String getTimeOutDay() {
        return timeOutDay;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getFileNumber() {
        return fileNumber;
    }
}
