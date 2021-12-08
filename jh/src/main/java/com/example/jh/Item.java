/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jh;

import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;

import java.util.Date;
import java.util.Objects;

// tag::code[]
public class Item {

	private @Id String id;
	private String name;
	private String description;
	private double price;
	private String distributorRegion;
	private Date releaseDate;
	private int availableUnits;
	private Point location;
	private boolean active;

	// end::code[]

	private Item() {}

	Item(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Item(String name, String alf_alarm_clock, String nothing_i_really_need, double v) {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDistributorRegion() {
		return distributorRegion;
	}

	public void setDistributorRegion(String distributorRegion) {
		this.distributorRegion = distributorRegion;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getAvailableUnits() {
		return availableUnits;
	}

	public void setAvailableUnits(int availableUnits) {
		this.availableUnits = availableUnits;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Item item = (Item) o;
		return Double.compare(item.price, price) == 0 && Objects.equals(id, item.id) && Objects.equals(name, item.name)
				&& Objects.equals(description, item.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, description, price);
	}

	@Override
	public String toString() {
		return "Item{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", description='" + description + '\'' + ", price="
				+ price + '}';
	}
}
