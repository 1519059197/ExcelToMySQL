package com.example.demo.entity;

import com.github.crab2died.annotation.ExcelField;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Classname tTumorData
 * @Description TODO
 * @Date 2021-02-02 15:05
 * @Author by qgc
 */
@Table(name = "t_tumor_data")
@Data
public class tTumorData {
    @Id
    @GeneratedValue(generator="JDBC")
    private Integer id;
    @Column
    @ExcelField(title = "id", order = 1)
    private String idNumber;
    @Column
    @ExcelField(title = "diagnosis", order = 2)
    private String diagnosis;
    @Column
    @ExcelField(title = "radius_mean", order = 3)
    private String radiusMean;
    @Column
    @ExcelField(title = "texture_mean", order = 4)
    private String textureMean;
    @Column
    @ExcelField(title = "perimeter_mean", order = 5)
    private String perimeterMean;
    @Column
    @ExcelField(title = "area_mean", order = 6)
    private String areaMean;
    @Column
    @ExcelField(title = "smoothness_mean", order = 7)
    private String smoothnessMean;
    @Column
    @ExcelField(title = "compactness_mean", order = 8)
    private String compactnessMean;
    @Column
    @ExcelField(title = "concavity_mean", order = 9)
    private String concavityMean;
    @Column
    @ExcelField(title = "concave_points_mean", order = 10)
    private String concavePointsMean;
    @Column
    @ExcelField(title = "symmetry_mean", order = 11)
    private String symmetryMean;
    @Column
    @ExcelField(title = "fractal_dimension_mean", order = 12)
    private String fractalDimensionMean;
    @Column
    @ExcelField(title = "image", order = 13)
    private String image;
}
