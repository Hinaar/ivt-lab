package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;
  private TorpedoStore mockStorePrimary;
  private TorpedoStore mockStoreSecondary;

  @Before
  public void init(){
    mockStorePrimary = mock(TorpedoStore.class);
    mockStoreSecondary = mock(TorpedoStore.class);

    this.ship = new GT4500(mockStorePrimary, mockStoreSecondary);
  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange
    when(mockStorePrimary.isEmpty().thenReturn(false);
    when(mockStorePrimary.fire(1)).thenReturn(true);

    when(mockStoreSecondary.isEmpty()).thenReturn(false);
    when(mockStoreSecondary.fire(1)).thenReturn(true);

    // Act
    boolean result = ship.fireTorpedo(FiringMode.SINGLE);

    // Assert
    assertEquals(true, result);
  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
