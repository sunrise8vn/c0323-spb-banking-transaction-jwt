package com.cg.model;

import com.cg.model.dto.CustomerAvatarResDTO;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer_avatar")
@Accessors(chain = true)
public class CustomerAvatar {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_folder")
    private String fileFolder;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "file_type")
    private String fileType;

    @Column(name = "cloud_id")
    private String cloudId;

    public CustomerAvatarResDTO toCustomerAvatarResDTO() {
        return new CustomerAvatarResDTO()
                .setId(id)
                .setFileName(fileName)
                .setFileFolder(fileFolder)
                .setFileUrl(fileUrl)
                .setFileType(fileType)
                .setCloudId(cloudId)
                ;
    }

}
