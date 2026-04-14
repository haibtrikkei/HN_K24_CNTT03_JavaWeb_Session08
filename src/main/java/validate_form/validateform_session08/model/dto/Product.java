package validate_form.validateform_session08.model.dto;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import validate_form.validateform_session08.custom_validator.ProIdValid;

import java.util.Date;

public class Product {
    @NotBlank(message = "Chưa nhập mã sản phẩm")
    @ProIdValid(message = "Mã sản phẩm phải bắt đầu bằng chữ P")
    private String proId;
    @NotBlank(message = "Chưa nhập tên sản phẩm")
    private String proName;
    @NotBlank(message = "Chưa nhập nhà sản xuất")
    private String producer;
    @NotNull(message = "Chưa nhập năm sản xuất")
    private Integer yearMaking;
    @NotNull(message = "Chưa nhập ngày hết hạn")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @Past(message = "Ngày hết hạn không hợp lệ")
    private Date expireDate;
    @NotNull(message = "Chưa nhập số lượng")
    @Min(value = 0,message = "Số lượng tối thiểu là 0")
    private Integer quantity;
    @NotNull(message = "Chưa nhập giá sản phẩm")
    @Min(value = 0,message = "Giá sản phẩm phải lơn hơn hay bằng 0")
    private Double price;

    public Product() {
    }

    public Product(String proId, String proName, String producer, Integer yearMaking, Date expireDate, Integer quantity, Double price) {
        this.proId = proId;
        this.proName = proName;
        this.producer = producer;
        this.yearMaking = yearMaking;
        this.expireDate = expireDate;
        this.quantity = quantity;
        this.price = price;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(Integer yearMaking) {
        this.yearMaking = yearMaking;
    }
}
