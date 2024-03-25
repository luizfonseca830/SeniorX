/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior;

public interface CrudValidator<T, ID> {

	public void beforeCreate(T entity);

	public void beforeUpdate(T entity);

	public void beforeDelete(ID id);

}
