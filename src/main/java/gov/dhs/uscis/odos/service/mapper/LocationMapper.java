package gov.dhs.uscis.odos.service.mapper;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import gov.dhs.uscis.odos.domain.Location;
import gov.dhs.uscis.odos.service.dto.LocationDTO;

/**
 * Mapper for the entity Location and its DTO LocationDTO.
 */
@Named
public class LocationMapper implements EntityMapper<LocationDTO, Location> {

	// /@Inject
	Mapper mapper = new DozerBeanMapper();

	Location fromId(Long id) {
		if (id == null) {
			return null;
		}
		Location location = new Location();
		location.setId(id);
		return location;
	}

	@Override
	public Location toEntity(LocationDTO dto) {

		return mapper.map(dto, Location.class);
	}

	@Override
	public LocationDTO toDto(Location entity) {

		return mapper.map(entity, LocationDTO.class);
	}

	@Override
	public List<Location> toEntity(List<LocationDTO> dtoList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationDTO> toDto(List<Location> entityList) {
		// TODO Auto-generated method stub
		return null;
	}
}
