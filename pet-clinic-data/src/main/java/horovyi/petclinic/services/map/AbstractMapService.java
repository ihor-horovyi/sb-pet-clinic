package horovyi.petclinic.services.map;

import horovyi.petclinic.model.BaseEntity;
import horovyi.petclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    private Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(T object) {
        if (object == null) {
            throw new RuntimeException("Object cannot be null");
        }

        if (object.getId() == null) {
            object.setId(getNextId());
        }

        map.put(object.getId(), object);
        return findById((ID) object.getId());
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(e -> e.getValue() != null && e.getValue().equals(object));
    }

    private Long getNextId() {
        return map.keySet().stream().max(Long::compareTo).orElse(0L) + 1;
    }

}
