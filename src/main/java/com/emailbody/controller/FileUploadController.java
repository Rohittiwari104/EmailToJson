package com.emailbody.controller;
import com.emailbody.entity.JobPosting;
import com.emailbody.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@RestController
@RequestMapping("api/upload")
public class FileUploadController {

      @Autowired
      private UploadFileService uploadFileService;
    @PostMapping("/uploaded")
    public ResponseEntity<Map<String, Map<String, Object>>>uploadFile(@RequestParam("file") MultipartFile file) {
        Map<String, Map<String, Object>> parsedData = null;
        try {
            JobPosting jobPosting = new JobPosting();
            parsedData = uploadFileService.parseTextFile(file);
            Map<String, Object> innerParsedData = (Map<String, Object>) parsedData.get("parsedData");
            jobPosting.setAssigned(Boolean.parseBoolean(Objects.toString(parsedData.get("isAssigned"), "false")));
            jobPosting.setTlId(Objects.toString(innerParsedData.get("tlId"), ""));
            jobPosting.setAmId(Objects.toString(innerParsedData.get("amId"), ""));
            jobPosting.setAddress(Objects.toString(innerParsedData.get("address"), ""));
            jobPosting.setAlias(Objects.toString(innerParsedData.get("alias"), ""));
            jobPosting.setASAP(Boolean.parseBoolean(Objects.toString(innerParsedData.get("asap"), "false")));
            jobPosting.setAtsID(Objects.toString(innerParsedData.get("AtsId"), ""));
            jobPosting.setFinalUserAssignee(Objects.toString(innerParsedData.get("finalUserAssignee"), ""));
            jobPosting.setDurationType(Objects.toString(innerParsedData.get("durationType"), ""));
            jobPosting.setProviderJobID(Long.parseLong(Objects.toString(innerParsedData.get("providerJobID"), "0")));
            jobPosting.setCustomerID(Integer.parseInt(Objects.toString(innerParsedData.get("customerID"), "0")));
            jobPosting.setSourceID(Objects.toString(innerParsedData.get("Job ID"), ""));
            jobPosting.setEndDate(Objects.toString(innerParsedData.get("endDate"), ""));
            jobPosting.setSourceName(Objects.toString(innerParsedData.get("sourceName"), ""));
            jobPosting.setPostDate(Objects.toString(innerParsedData.get("postDate"), ""));
            jobPosting.setStatusString(Objects.toString(innerParsedData.get("statusString"), ""));
            jobPosting.setPriority(Objects.toString(innerParsedData.get("priority"), ""));
            jobPosting.setPositions(Integer.parseInt(Objects.toString(innerParsedData.get("Openings"), "0")));
            jobPosting.setStartDate(Objects.toString(innerParsedData.get("Start and End Date"), ""));
            jobPosting.setDuration(Objects.toString(innerParsedData.get("duration"), ""));
            jobPosting.setJobSpecialty(Objects.toString(innerParsedData.get("jobSpecialty"), ""));
            jobPosting.setDegree(Objects.toString(innerParsedData.get("degree"), ""));
            jobPosting.setJobBoardDegree(Objects.toString(innerParsedData.get("jobBoardDegree"), ""));
            jobPosting.setJobBoardSpecialty(Objects.toString(innerParsedData.get("jobBoardSpecialty"), ""));
            jobPosting.setCleanDegree(Objects.toString(innerParsedData.get("cleanDegree"), ""));
            jobPosting.setCleanSpecialty(Objects.toString(innerParsedData.get("cleanSpecialty"), ""));
            jobPosting.setCleanShift(Objects.toString(innerParsedData.get("cleanShift"), ""));
            jobPosting.setCategory(Objects.toString(innerParsedData.get("category"), ""));
            jobPosting.setFacility(Objects.toString(innerParsedData.get("Client"), ""));
            jobPosting.setUnit(Objects.toString(innerParsedData.get("unit"), ""));
            jobPosting.setShift(Objects.toString(innerParsedData.get("Shift"), ""));
            jobPosting.setWorkType(Objects.toString(innerParsedData.get("Job Type"), ""));
            jobPosting.setNote(Objects.toString(innerParsedData.get("Description"), ""));
            jobPosting.setBillRate(Double.parseDouble(Objects.toString(innerParsedData.get("billRate"), "0.0")));
            jobPosting.setGuaranteedHours(Objects.toString(innerParsedData.get("guaranteedHours"), ""));
            jobPosting.setCity(Objects.toString(innerParsedData.get("city"), ""));
            jobPosting.setState(Objects.toString(innerParsedData.get("state"), ""));
            jobPosting.setZip(Objects.toString(innerParsedData.get("zip"), ""));
            jobPosting.setASAP(Boolean.parseBoolean(Objects.toString(innerParsedData.get("isASAP"), "false")));
            jobPosting.setHotFl(Boolean.parseBoolean(Objects.toString(innerParsedData.get("hotFl"), "false")));
            jobPosting.setOtRules(Objects.toString(innerParsedData.get("otRules"), ""));
            jobPosting.setChargeRate(Objects.toString(innerParsedData.get("chargeRate"), ""));
            jobPosting.setCallbackRate(Objects.toString(innerParsedData.get("callbackRate"), ""));
            jobPosting.setOnCallRateDescription(Objects.toString(innerParsedData.get("onCallRateDescription"), ""));
            jobPosting.setCoordinator(Objects.toString(innerParsedData.get("coordinator"), ""));
            jobPosting.setWinterPlanNeed(Objects.toString(innerParsedData.get("winterPlanNeed"), ""));
            jobPosting.setLicenses(Objects.toString(innerParsedData.get("licenses"), ""));
            jobPosting.setMinExperienceRequired(Objects.toString(innerParsedData.get("minExperienceRequired"), ""));
            jobPosting.setCleanDegreeID(Integer.parseInt(Objects.toString(innerParsedData.get("cleanDegreeID"), "0")));
            jobPosting.setCleanSpecialtyID(Integer.parseInt(Objects.toString(innerParsedData.get("cleanSpecialtyID"), "0")));
            jobPosting.setJobURL(Objects.toString(innerParsedData.get("jobURL"), ""));
            jobPosting.setbRate(Double.parseDouble(Objects.toString(innerParsedData.get("Agency Regular Bill Rate"), "0.0")));
            jobPosting.setbMinPRate(Double.parseDouble(Objects.toString(innerParsedData.get("bMinRate"), "0.0")));
            jobPosting.setBotRate(Double.parseDouble(Objects.toString(innerParsedData.get("botRate"), "0.0")));
            jobPosting.setBcRate(Double.parseDouble(Objects.toString(innerParsedData.get("bcRate"), "0.0")));
            jobPosting.setBoCRate(Double.parseDouble(Objects.toString(innerParsedData.get("boCRate"), "0.0")));
            jobPosting.setBoRate(Double.parseDouble(Objects.toString(innerParsedData.get("boRate"), "0.0")));
            jobPosting.setbRate(Double.parseDouble(Objects.toString(innerParsedData.get("bPRate"), "0.0")));
            jobPosting.setbMinPRate(Double.parseDouble(Objects.toString(innerParsedData.get("bMinPRate"), "0.0")));
            jobPosting.setPositionRequirements(Objects.toString(innerParsedData.get("positionRequirements"), ""));
            jobPosting.setPermFee(Double.parseDouble(Objects.toString(innerParsedData.get("permFee"), "0.0")));
            jobPosting.setOtRule(Objects.toString(innerParsedData.get("otRule"), ""));
            jobPosting.setOtRate2(Double.parseDouble(Objects.toString(innerParsedData.get("otRate2"), "0.0")));
            jobPosting.setOtHours(Double.parseDouble(Objects.toString(innerParsedData.get("otHours"), "0.0")));
            jobPosting.setOtHours2(Double.parseDouble(Objects.toString(innerParsedData.get("otHours2"), "0.0")));
            jobPosting.setFormattedStartDate(Objects.toString(innerParsedData.get("formattedStartDate"), ""));
            jobPosting.setFormattedEndDate(Objects.toString(innerParsedData.get("formattedEndDate"), ""));
            jobPosting.setDurationWeeks(Integer.parseInt(Objects.toString(innerParsedData.get("durationWeeks"), "0")));
            jobPosting.setAssigned(Boolean.parseBoolean(Objects.toString(innerParsedData    .get("assigned"), "false")));

            Map<String, Object> jobDetails = new HashMap<>();
            jobDetails.put("isAssigned", jobPosting.isAssigned());
            jobDetails.put("amId", jobPosting.getAmId());
            jobDetails.put("tlId", jobPosting.getTlId());
            jobDetails.put("address", jobPosting.getAddress());
            jobDetails.put("alias", jobPosting.getAlias());
            jobDetails.put("ASAP", jobPosting.isASAP());
            jobDetails.put("atsID", jobPosting.getAtsID());
            jobDetails.put("finalUserAssignee", jobPosting.getFinalUserAssignee());
            jobDetails.put("durationType", jobPosting.getDurationType());
            jobDetails.put("providerJobID", jobPosting.getProviderJobID());
            jobDetails.put("customerID", jobPosting.getCustomerID());
            jobDetails.put("sourceID", jobPosting.getSourceID());
            jobDetails.put("endDate", jobPosting.getEndDate());
            jobDetails.put("sourceName", jobPosting.getSourceName());
            jobDetails.put("postDate", jobPosting.getPostDate());
            jobDetails.put("statusString", jobPosting.getStatusString());
            jobDetails.put("priority", jobPosting.getPriority());
            jobDetails.put("positions", jobPosting.getPositions());
            jobDetails.put("startDate", jobPosting.getStartDate());
            jobDetails.put("duration", jobPosting.getDuration());
            jobDetails.put("jobSpecialty", jobPosting.getJobSpecialty());
            jobDetails.put("degree", jobPosting.getDegree());
            jobDetails.put("jobBoardDegree", jobPosting.getJobBoardDegree());
            jobDetails.put("jobBoardSpecialty", jobPosting.getJobBoardSpecialty());
            jobDetails.put("cleanDegree", jobPosting.getCleanDegree());
            jobDetails.put("cleanSpecialty", jobPosting.getCleanSpecialty());
            jobDetails.put("cleanShift", jobPosting.getCleanShift());
            jobDetails.put("category", jobPosting.getCategory());
            jobDetails.put("facility", jobPosting.getFacility());
            jobDetails.put("unit", jobPosting.getUnit());
            jobDetails.put("shift", jobPosting.getShift());
            jobDetails.put("workType", jobPosting.getWorkType());
            jobDetails.put("note", jobPosting.getNote());
            jobDetails.put("billRate", jobPosting.getBillRate());
            jobDetails.put("guaranteedHours", jobPosting.getGuaranteedHours());
            jobDetails.put("city", jobPosting.getCity());
            jobDetails.put("state", jobPosting.getState());
            jobDetails.put("zip", jobPosting.getZip());
            jobDetails.put("isASAP", jobPosting.isASAP());
            jobDetails.put("hotFl", jobPosting.isHotFl());
            jobDetails.put("otRules", jobPosting.getOtRules());
            jobDetails.put("chargeRate", jobPosting.getChargeRate());
            jobDetails.put("callbackRate", jobPosting.getCallbackRate());
            jobDetails.put("onCallRateDescription", jobPosting.getOnCallRateDescription());
            jobDetails.put("coordinator", jobPosting.getCoordinator());
            jobDetails.put("winterPlanNeed", jobPosting.getWinterPlanNeed());
            jobDetails.put("licenses", jobPosting.getLicenses());
            jobDetails.put("minExperienceRequired", jobPosting.getMinExperienceRequired());
            jobDetails.put("cleanDegreeID", jobPosting.getCleanDegreeID());
            jobDetails.put("cleanSpecialtyID", jobPosting.getCleanSpecialtyID());
            jobDetails.put("jobURL", jobPosting.getJobURL());
            jobDetails.put("bRate", jobPosting.getbRate());
            jobDetails.put("bMinRate", jobPosting.getbMinRate());
            jobDetails.put("botRate", jobPosting.getBotRate());
            jobDetails.put("bcRate", jobPosting.getBcRate());
            jobDetails.put("boCRate", jobPosting.getBoCRate());
            jobDetails.put("boRate", jobPosting.getBoRate());
            jobDetails.put("bPRate", jobPosting.getbPRate());
            jobDetails.put("bMinPRate", jobPosting.getbMinPRate());
            jobDetails.put("positionRequirements", jobPosting.getPositionRequirements());
            jobDetails.put("permFee", jobPosting.getPermFee());
            jobDetails.put("otRule", jobPosting.getOtRule());
            jobDetails.put("otRate2", jobPosting.getOtRate2());
            jobDetails.put("otHours", jobPosting.getOtHours());
            jobDetails.put("otHours2", jobPosting.getOtHours2());
            jobDetails.put("formattedStartDate", jobPosting.getFormattedStartDate());
            jobDetails.put("formattedEndDate", jobPosting.getFormattedEndDate());
            jobDetails.put("durationWeeks", jobPosting.getDurationWeeks());
            jobDetails.put("assigned", jobPosting.isAssigned());

            Map<String, Map<String, Object>> response = new HashMap<>();
            response.put("jobDetails", jobDetails);

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            e.printStackTrace();
        }
      return  null;
    }
}
