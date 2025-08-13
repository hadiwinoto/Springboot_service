package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Entity yang memetakan tabel “employees_table” sesuai dengan
 * struktur kolom yang Anda lampirkan.
 */
@Entity
@Table(name = "temployee")
public class Employee {

    // -----------------------------------------------------------------
    // Primary Key
    // -----------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_employee_id")
    private Integer pkemployeeId;

    // -----------------------------------------------------------------
    // Kolom utama (tipe data sesuaikan dengan definisi DB)
    // -----------------------------------------------------------------
    @Column(name = "employee_no", length = 50, nullable = false, unique = true)
    private String employeeNo;

    @Column(name = "old_employee_no", length = 50, nullable = false)
    private String oldEmployeeNo;

    @Column(name = "full_name", length = 200, nullable = false)
    private String fullName;

    // Foreign‑key (hanya disimpan sebagai Integer, dapat di‑ubah ke relasi nanti)
    @Column(name = "fk_employeersource_id", nullable = false)
    private Integer fkEmployerSourceId;

    @Column(name = "pph_calculation_method", nullable = false)
    private Integer pphCalculationMethod;

    @Column(name = "fk_employeedirectorate_id", nullable = false)
    private Integer fkEmployeeDirectorateId;

    @Column(name = "fk_employeedepartment_id", nullable = false)
    private Integer fkEmployeeDepartmentId;

    @Column(name = "fk_employeesubdepartment_id", nullable = false)
    private Integer fkEmployeeSubDepartmentId;

    @Column(name = "fk_employeesection_id", nullable = false)
    private Integer fkEmployeeSectionId;

    @Column(name = "fk_employeelevel_id", nullable = false)
    private Integer fkEmployeeLevelId;

    @Column(name = "position", length = 150, nullable = false)
    private String position;

    @Column(name = "postion_date", nullable = false)
    private LocalDate positionDate;

    @Column(name = "fk_employeegrade_id", length = 11, nullable = false)
    private String fkEmployeeGradeId;

    @Column(name = "fk_hiredbased_id", nullable = false)
    private Integer fkHiredBasedId;

    @Column(name = "fk_worklocation_id", nullable = false)
    private Integer fkWorkLocationId;

    @Column(name = "fk_bpjsreg_id", nullable = false)
    private Integer fkBpjsRegId;

    @Column(name = "fk_contract_id", nullable = false)
    private Integer fkContractId;

    @Column(name = "fk_employeecontract_id", nullable = false)
    private Integer fkEmployeeContractId;

    @Column(name = "fk_pkwtstatus_id", nullable = false)
    private Integer fkPkwtStatusId;

    @Column(name = "join_date", nullable = false)
    private LocalDateTime joinDate;

    @Column(name = "fk_blackliststatus_id", nullable = false)
    private Integer fkBlacklistStatusId;

    @Column(name = "blacklist_date")
    private LocalDate blacklistDate;

    @Column(name = "blacklist_reason", length = 600)
    private String blacklistReason;

    @Column(name = "birth_place", length = 100)
    private String birthPlace;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "ktp_no", length = 100)
    private String ktpNo;

    @Column(name = "kk_no", length = 100)
    private String kkNo;

    @Column(name = "npwp_no", columnDefinition = "varbinary(100)")
    private byte[] npwpNo;

    @Column(name = "ptkp", length = 4)
    private String ptkp;

    @Column(name = "married_status", length = 20)
    private String marriedStatus;

    @Column(name = "sex", length = 15)
    private String sex;

    @Column(name = "number_of_children")
    private Integer numberOfChildren;

    @Column(name = "religion", length = 20)
    private String religion;

    @Column(name = "nation", length = 100)
    private String nation;

    @Column(name = "passport_no", length = 100)
    private String passportNo;

    @Column(name = "phone_no", length = 200)
    private String phoneNo;

    @Column(name = "personal_email", length = 100)
    private String personalEmail;

    @Column(name = "office_email", length = 100)
    private String officeEmail;

    @Column(name = "address_ktp", length = 300)
    private String addressKtp;

    @Column(name = "address_residential", length = 300)
    private String addressResidential;

    @Column(name = "spouse_name", length = 200)
    private String spouseName;

    @Column(name = "children_name1", length = 200)
    private String childrenName1;

    @Column(name = "children_birtdate1")
    private LocalDate childrenBirthDate1;

    @Column(name = "children_name2", length = 200)
    private String childrenName2;

    @Column(name = "children_birtdate2")
    private LocalDate childrenBirthDate2;

    @Column(name = "children_name3", length = 200)
    private String childrenName3;

    @Column(name = "children_birtdate3")
    private LocalDate childrenBirthDate3;

    @Column(name = "children_name4", length = 200)
    private String childrenName4;

    @Column(name = "children_birtdate4")
    private LocalDate childrenBirthDate4;

    @Column(name = "emergency_contact_name", length = 100)
    private String emergencyContactName;

    @Column(name = "emergency_phone", length = 50)
    private String emergencyPhone;

    @Column(name = "emergency_address", length = 300)
    private String emergencyAddress;

    @Column(name = "fk_bank_id", nullable = false)
    private Integer fkBankId;

    @Column(name = "bank_no", length = 200)
    private String bankNo;

    @Column(name = "beneficiary_name", length = 200)
    private String beneficiaryName;

    @Column(name = "fk_status_id", nullable = false)
    private Integer fkStatusId;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "created_by", length = 100)
    private String createdBy;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @Column(name = "updated_by", length = 100)
    private String updatedBy;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------
    public Employee() {}

    // Bisa menambahkan constructor yang menerima field‑field penting bila diperlukan
    // (tidak wajib, JPA hanya butuh constructor tanpa argumen)

    // -----------------------------------------------------------------
    // Getters & Setters
    // -----------------------------------------------------------------
    public Integer getAttendanceId() {
        return pkemployeeId;
    }

    public void setPkemployeeId(Integer pkemployeeId) {
        this.pkemployeeId = pkemployeeId;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }


     public String getEmployeeName() {
        return fullName;
    }

    public void setEmployeeName(String fullName) {
        this.fullName = fullName;
    }

    // ... (generate getter & setter untuk semua field di atas)
    // Untuk kepraktisan, gunakan IDE (mis. IntelliJ/Lombok) untuk menghasilkan
    // semua getter/setter secara otomatis.

}
