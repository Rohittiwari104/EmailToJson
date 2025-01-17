package com.emailbody.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long JobId;
    private boolean isAssigned;
    private String amId;
    private String tlId;
    private String finalUserAssignee;
    private String durationType;
    private String alias;
    private Long providerJobID;
    private int customerID;
    private String sourceID;
    private String endDate;
    private String sourceName;
    private String postDate;
    private String statusString;
    private String priority;
    private int positions;
    private String startDate;
    private String duration;
    private String jobSpecialty;
    private String degree;
    private String jobBoardDegree;
    private String jobBoardSpecialty;
    private String cleanDegree;
    private String cleanSpecialty;
    private String cleanShift;
    private String category;
    private String facility;
    private String unit;
    private String shift;
    private String workType;
    private String note;
    private double billRate;
    private String guaranteedHours;
    private String address;
    private String city;
    private String state;
    private String zip;
    private boolean isASAP;
    private boolean hotFl;
    private String atsID;
    private String title;
    private String otRules;
    private String chargeRate;
    private String callbackRate;
    private String onCallRateDescription;
    private String coordinator;
    private String winterPlanNeed;
    private String licenses;
    private String minExperienceRequired;
    private int cleanDegreeID;
    private int cleanSpecialtyID;
    private String jobURL;
    private double bRate;
    private double bMinRate;
    private double botRate;
    private double bcRate;
    private double boCRate;
    private double boRate;
    private double bPRate;
    private double bMinPRate;
    private String positionRequirements;
    private double permFee;
    private String otRule;
    private double otRate2;
    private double otHours;
    private double otHours2;
    private String formattedStartDate;
    private String formattedEndDate;
    private int durationWeeks;
    private boolean assigned;

     public boolean isAssigned() {
         return assigned;
     }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public Long getJobId() {
        return JobId;
    }

    public void setJobId(Long jobId) {
        JobId = jobId;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    public void setDurationWeeks(int durationWeeks) {
        this.durationWeeks = durationWeeks;
    }

    public String getFormattedEndDate() {
        return formattedEndDate;
    }

    public void setFormattedEndDate(String formattedEndDate) {
        this.formattedEndDate = formattedEndDate;
    }

    public String getFormattedStartDate() {
        return formattedStartDate;
    }

    public void setFormattedStartDate(String formattedStartDate) {
        this.formattedStartDate = formattedStartDate;
    }

    public double getOtHours2() {
        return otHours2;
    }

    public void setOtHours2(double otHours2) {
        this.otHours2 = otHours2;
    }

    public double getOtHours() {
        return otHours;
    }

    public void setOtHours(double otHours) {
        this.otHours = otHours;
    }

    public double getOtRate2() {
        return otRate2;
    }

    public void setOtRate2(double otRate2) {
        this.otRate2 = otRate2;
    }

    public String getOtRule() {
        return otRule;
    }

    public void setOtRule(String otRule) {
        this.otRule = otRule;
    }

    public double getPermFee() {
        return permFee;
    }

    public void setPermFee(double permFee) {
        this.permFee = permFee;
    }

    public String getPositionRequirements() {
        return positionRequirements;
    }

    public void setPositionRequirements(String positionRequirements) {
        this.positionRequirements = positionRequirements;
    }

    public double getbMinPRate() {
        return bMinPRate;
    }

    public void setbMinPRate(double bMinPRate) {
        this.bMinPRate = bMinPRate;
    }

    public double getbPRate() {
        return bPRate;
    }

    public void setbPRate(double bPRate) {
        this.bPRate = bPRate;
    }

    public double getBoRate() {
        return boRate;
    }

    public void setBoRate(double boRate) {
        this.boRate = boRate;
    }

    public double getBoCRate() {
        return boCRate;
    }

    public void setBoCRate(double boCRate) {
        this.boCRate = boCRate;
    }

    public double getBcRate() {
        return bcRate;
    }

    public void setBcRate(double bcRate) {
        this.bcRate = bcRate;
    }

    public double getBotRate() {
        return botRate;
    }

    public void setBotRate(double botRate) {
        this.botRate = botRate;
    }

    public double getbMinRate() {
        return bMinRate;
    }

    public void setbMinRate(double bMinRate) {
        this.bMinRate = bMinRate;
    }

    public double getbRate() {
        return bRate;
    }

    public void setbRate(double bRate) {
        this.bRate = bRate;
    }

    public String getJobURL() {
        return jobURL;
    }

    public void setJobURL(String jobURL) {
        this.jobURL = jobURL;
    }

    public int getCleanSpecialtyID() {
        return cleanSpecialtyID;
    }

    public void setCleanSpecialtyID(int cleanSpecialtyID) {
        this.cleanSpecialtyID = cleanSpecialtyID;
    }

    public int getCleanDegreeID() {
        return cleanDegreeID;
    }

    public void setCleanDegreeID(int cleanDegreeID) {
        this.cleanDegreeID = cleanDegreeID;
    }

    public String getMinExperienceRequired() {
        return minExperienceRequired;
    }

    public void setMinExperienceRequired(String minExperienceRequired) {
        this.minExperienceRequired = minExperienceRequired;
    }

    public String getLicenses() {
        return licenses;
    }

    public void setLicenses(String licenses) {
        this.licenses = licenses;
    }

    public String getWinterPlanNeed() {
        return winterPlanNeed;
    }

    public void setWinterPlanNeed(String winterPlanNeed) {
        this.winterPlanNeed = winterPlanNeed;
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    public String getOnCallRateDescription() {
        return onCallRateDescription;
    }

    public void setOnCallRateDescription(String onCallRateDescription) {
        this.onCallRateDescription = onCallRateDescription;
    }

    public String getCallbackRate() {
        return callbackRate;
    }

    public void setCallbackRate(String callbackRate) {
        this.callbackRate = callbackRate;
    }

    public String getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(String chargeRate) {
        this.chargeRate = chargeRate;
    }

    public String getOtRules() {
        return otRules;
    }

    public void setOtRules(String otRules) {
        this.otRules = otRules;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAtsID() {
        return atsID;
    }

    public void setAtsID(String atsID) {
        this.atsID = atsID;
    }

    public boolean isHotFl() {
        return hotFl;
    }

    public void setHotFl(boolean hotFl) {
        this.hotFl = hotFl;
    }

    public boolean isASAP() {
        return isASAP;
    }

    public void setASAP(boolean ASAP) {
        isASAP = ASAP;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;//import com.emailbody.model.UploadFileResponse;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuaranteedHours() {
        return guaranteedHours;
    }

    public void setGuaranteedHours(String guaranteedHours) {
        this.guaranteedHours = guaranteedHours;
    }

    public double getBillRate() {
        return billRate;
    }

    public void setBillRate(double billRate) {
        this.billRate = billRate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCleanShift() {
        return cleanShift;
    }

    public void setCleanShift(String cleanShift) {
        this.cleanShift = cleanShift;
    }

    public String getCleanSpecialty() {





        return cleanSpecialty;
    }

    public void setCleanSpecialty(String cleanSpecialty) {
        this.cleanSpecialty = cleanSpecialty;
    }

    public String getCleanDegree() {
        return cleanDegree;
    }

    public void setCleanDegree(String cleanDegree) {
        this.cleanDegree = cleanDegree;
    }

    public String getJobBoardSpecialty() {
        return jobBoardSpecialty;
    }

    public void setJobBoardSpecialty(String jobBoardSpecialty) {
        this.jobBoardSpecialty = jobBoardSpecialty;
    }

    public String getJobBoardDegree() {
        return jobBoardDegree;
    }

    public void setJobBoardDegree(String jobBoardDegree) {
        this.jobBoardDegree = jobBoardDegree;
    }






    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getJobSpecialty() {
        return jobSpecialty;
    }

    public void setJobSpecialty(String jobSpecialty) {
        this.jobSpecialty = jobSpecialty;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getPositions() {
        return positions;
    }

    public void setPositions(int positions) {
        this.positions = positions;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatusString() {
        return statusString;
    }

    public void setStatusString(String statusString) {
        this.statusString = statusString;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Long getProviderJobID() {
        return providerJobID;
    }

    public void setProviderJobID(Long providerJobID) {
        this.providerJobID = providerJobID;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
    }

    public String getFinalUserAssignee() {
        return finalUserAssignee;
    }

    public void setFinalUserAssignee(String finalUserAssignee) {
        this.finalUserAssignee = finalUserAssignee;
    }

    public String getTlId() {
        return tlId;
    }

    public void setTlId(String tlId) {
        this.tlId = tlId;
    }

    public String getAmId() {
        return amId;
    }

     public void setAmId(String amId) {
        this.amId = amId;
    }

}


