/**
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.canvas.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtuml.canvas.language.canvas.CanvasPackage;
import org.xtuml.canvas.language.canvas.FloatingText;
import org.xtuml.canvas.language.canvas.Rectangle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floating Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.canvas.language.canvas.impl.FloatingTextImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.impl.FloatingTextImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatingTextImpl extends MinimalEObjectImpl.Container implements FloatingText
{
  /**
   * The cached value of the '{@link #getRect() <em>Rect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRect()
   * @generated
   * @ordered
   */
  protected Rectangle rect;

  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final String END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected String end = END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FloatingTextImpl()
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
    return CanvasPackage.Literals.FLOATING_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rectangle getRect()
  {
    return rect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRect(Rectangle newRect, NotificationChain msgs)
  {
    Rectangle oldRect = rect;
    rect = newRect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanvasPackage.FLOATING_TEXT__RECT, oldRect, newRect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRect(Rectangle newRect)
  {
    if (newRect != rect)
    {
      NotificationChain msgs = null;
      if (rect != null)
        msgs = ((InternalEObject)rect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanvasPackage.FLOATING_TEXT__RECT, null, msgs);
      if (newRect != null)
        msgs = ((InternalEObject)newRect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanvasPackage.FLOATING_TEXT__RECT, null, msgs);
      msgs = basicSetRect(newRect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.FLOATING_TEXT__RECT, newRect, newRect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnd(String newEnd)
  {
    String oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.FLOATING_TEXT__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CanvasPackage.FLOATING_TEXT__RECT:
        return basicSetRect(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CanvasPackage.FLOATING_TEXT__RECT:
        return getRect();
      case CanvasPackage.FLOATING_TEXT__END:
        return getEnd();
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
      case CanvasPackage.FLOATING_TEXT__RECT:
        setRect((Rectangle)newValue);
        return;
      case CanvasPackage.FLOATING_TEXT__END:
        setEnd((String)newValue);
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
      case CanvasPackage.FLOATING_TEXT__RECT:
        setRect((Rectangle)null);
        return;
      case CanvasPackage.FLOATING_TEXT__END:
        setEnd(END_EDEFAULT);
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
      case CanvasPackage.FLOATING_TEXT__RECT:
        return rect != null;
      case CanvasPackage.FLOATING_TEXT__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
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
    result.append(" (end: ");
    result.append(end);
    result.append(')');
    return result.toString();
  }

} //FloatingTextImpl
