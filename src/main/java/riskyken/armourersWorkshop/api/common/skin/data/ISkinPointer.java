package riskyken.armourersWorkshop.api.common.skin.data;

import riskyken.armourersWorkshop.api.common.skin.type.ISkinType;

public interface ISkinPointer {

    public ISkinIdentifier getIdentifier();
    
    /**
     * @deprecated  As of 0.48.0, replaced by {@link #getIdentifier()}
     */
    @Deprecated
    public int getSkinId();
    
    /**
     * @deprecated  As of 0.48.0, replaced by {@link #getIdentifier()}
     */
    public ISkinType getSkinType();
    
    public ISkinDye getSkinDye();
}
