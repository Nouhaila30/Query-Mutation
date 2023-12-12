package ma.xproce.inventoryservice.mapper;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dtos.CreatorRequest;
import ma.xproce.inventoryservice.dtos.VideoRequest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperConfig {
    private final ModelMapper modelMapper=new ModelMapper();
    public CreatorRequest fromCreator(Creator creator){
        return this.modelMapper.map(creator,CreatorRequest.class);
    }
    public VideoRequest fromCreator(Video video){
        return this.modelMapper.map(video,VideoRequest.class);
    }
}
