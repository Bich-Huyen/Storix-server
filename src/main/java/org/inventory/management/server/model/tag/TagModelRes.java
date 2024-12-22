package org.inventory.management.server.model.tag;

import lombok.Data;
import org.inventory.management.server.model.area.AreaResWithoutTag;

import java.util.Date;

@Data
public class TagModelRes {
    private Long id;
    private String name;
    private String description;
    private Date createdDate;
    private AreaResWithoutTag area;
}
