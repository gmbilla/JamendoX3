/*
 * Copyright (c) 2014 Santo Pfingsten
 *
 * This software is provided 'as-is', without any express or implied warranty.
 * In no event will the authors be held liable for any damages arising from the use of this software.
 *
 * Permission is granted to anyone to use this software for any purpose, including commercial
 * applications, and to alter it and redistribute it freely, subject to the following restrictions:
 *
 * 1. The origin of this software must not be misrepresented; you must not claim that you wrote the
 *    original software. If you use this software in a product, an acknowledgment in the product
 *    documentation would be appreciated but is not required.
 *
 * 2. Altered source versions must be plainly marked as such, and must not be misrepresented as being
 *    the original software.
 *
 * 3. This notice may not be removed or altered from any source distribution.
 */

package info.lusito.jamendo.api.query.album;

import info.lusito.jamendo.api.query.AbstractQueryList;
import info.lusito.jamendo.api.results.album.AlbumTrack;
import info.lusito.jamendo.api.annotations.JamQuery;
import info.lusito.jamendo.api.enums.AlbumOrder;
import info.lusito.jamendo.api.enums.AudioFormat;
import info.lusito.jamendo.api.enums.ImageSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@JamQuery(value = "albums/tracks")
public class AlbumTrackQuery extends AbstractQueryList<AlbumTrack, AlbumTrackQuery> {

    protected List<AlbumOrder> order;
    protected List<Integer> id;
    protected String name;
    protected String namesearch;
    protected List<Integer> artist_id;
    protected String artist_name;
    protected String datebetween;
    protected ImageSize imagesize;
    protected AudioFormat audioformat;
    protected AudioFormat audiodlformat;
    protected List<Integer> track_id;
    protected String track_name;

    public AlbumTrackQuery order(AlbumOrder... values) {
        if (order == null) {
            order = new ArrayList<AlbumOrder>();
        }
        order.addAll(Arrays.asList(values));
        return this;
    }

    public AlbumTrackQuery id(Integer... values) {
        if (id == null) {
            id = new ArrayList<Integer>();
        }
        id.addAll(Arrays.asList(values));
        return this;
    }

    public AlbumTrackQuery name(String value) {
        name = value;
        return this;
    }

    public AlbumTrackQuery namesearch(String value) {
        namesearch = value;
        return this;
    }

    public AlbumTrackQuery artist_id(Integer... values) {
        if (artist_id == null) {
            artist_id = new ArrayList<Integer>();
        }
        artist_id.addAll(Arrays.asList(values));
        return this;
    }

    public AlbumTrackQuery artist_name(String value) {
        artist_name = value;
        return this;
    }

    public AlbumTrackQuery datebetween(String value) {
        datebetween = value;
        return this;
    }

    public AlbumTrackQuery datebetween(Date from, Date to) {
        datebetween = DATE_FORMAT.format(from) + "_" + DATE_FORMAT.format(to);
        return this;
    }

    /**
     * @param value Currently _30 is not supported
     */
    public AlbumTrackQuery imagesize(ImageSize value) {
        imagesize = value;
        return this;
    }

    public AlbumTrackQuery audioformat(AudioFormat value) {
        audioformat = value;
        return this;
    }

    public AlbumTrackQuery audiodlformat(AudioFormat value) {
        audiodlformat = value;
        return this;
    }

    public AlbumTrackQuery track_id(Integer... values) {
        if (track_id == null) {
            track_id = new ArrayList<Integer>();
        }
        track_id.addAll(Arrays.asList(values));
        return this;
    }

    public AlbumTrackQuery track_name(String value) {
        track_name = value;
        return this;
    }
}
