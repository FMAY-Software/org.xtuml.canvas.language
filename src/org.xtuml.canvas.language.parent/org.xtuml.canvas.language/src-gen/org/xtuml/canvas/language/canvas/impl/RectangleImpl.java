/**
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.canvas.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtuml.canvas.language.canvas.CanvasPackage;
import org.xtuml.canvas.language.canvas.Rectangle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.canvas.language.canvas.impl.RectangleImpl#getX <em>X</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.impl.RectangleImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.impl.RectangleImpl#getW <em>W</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.impl.RectangleImpl#getH <em>H</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleImpl extends MinimalEObjectImpl.Container implements Rectangle
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getW() <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected static final int W_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getW() <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected int w = W_EDEFAULT;

  /**
   * The default value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected static final int H_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected int h = H_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RectangleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CanvasPackage.Literals.RECTANGLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.RECTANGLE__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.RECTANGLE__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getW()
  {
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setW(int newW)
  {
    int oldW = w;
    w = newW;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.RECTANGLE__W, oldW, w));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getH()
  {
    return h;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setH(int newH)
  {
    int oldH = h;
    h = newH;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.RECTANGLE__H, oldH, h));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CanvasPackage.RECTANGLE__X:
        return getX();
      case CanvasPackage.RECTANGLE__Y:
        return getY();
      case CanvasPackage.RECTANGLE__W:
        return getW();
      case CanvasPackage.RECTANGLE__H:
        return getH();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CanvasPackage.RECTANGLE__X:
        setX((Integer)newValue);
        return;
      case CanvasPackage.RECTANGLE__Y:
        setY((Integer)newValue);
        return;
      case CanvasPackage.RECTANGLE__W:
        setW((Integer)newValue);
        return;
      case CanvasPackage.RECTANGLE__H:
        setH((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CanvasPackage.RECTANGLE__X:
        setX(X_EDEFAULT);
        return;
      case CanvasPackage.RECTANGLE__Y:
        setY(Y_EDEFAULT);
        return;
      case CanvasPackage.RECTANGLE__W:
        setW(W_EDEFAULT);
        return;
      case CanvasPackage.RECTANGLE__H:
        setH(H_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CanvasPackage.RECTANGLE__X:
        return x != X_EDEFAULT;
      case CanvasPackage.RECTANGLE__Y:
        return y != Y_EDEFAULT;
      case CanvasPackage.RECTANGLE__W:
        return w != W_EDEFAULT;
      case CanvasPackage.RECTANGLE__H:
        return h != H_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", w: ");
    result.append(w);
    result.append(", h: ");
    result.append(h);
    result.append(')');
    return result.toString();
  }

} //RectangleImpl