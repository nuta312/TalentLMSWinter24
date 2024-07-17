package api.asserts;

import api.entities.BaseEntity;
import api.entities.User;

public class UserAssert extends EntityAssert {
    public UserAssert(BaseEntity actualBaseEntity) {
        super(actualBaseEntity);
    }

    public static UserAssert assertThat(User user) {
        return new UserAssert(user);
    }
}