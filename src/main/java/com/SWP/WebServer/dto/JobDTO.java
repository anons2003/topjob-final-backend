package com.SWP.WebServer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDTO {

    private Long id;
    private String title;
    private String description;
    private String jobTypeName;
    private Integer jobTypeId;
    private String jobCategoryName;
    private Integer jobCategoryId;
    private String salaryType;
    private BigDecimal minSalary;
    private BigDecimal maxSalary;
    private String skills;
    private String qualifications;
    private String experience;
    private String industry;
    private String address;
    private String country;
    private String state;
    private String city;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String enterpriseName;
    private Integer enterpriseId;
    private boolean isActive;
    private String avatarUrl;
    // Getters and setters
    private List<BookmarkDTO> bookmarks;
}
