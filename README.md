# COMP1010-Assignment
# Song Catalogue Application

## Problem Description

This application manages song catalogues, allowing users to create and interact with playlists. Each playlist contains songs, which are associated with artists (either bands or solo artists). The program provides functionality to navigate through songs, move to the previous or next song, and shuffle the playlist for random playback.

## Program Structure

### Key Components:
- **Song Class:** Represents an individual song with the following attributes:
  - Title
  - Artist (associated with an `Artist` object)
  - Album (if the song is part of one)
  - Length of the song

- **Artist Class:** Represents an artist or band, containing:
  - Name of the artist
  - Whether they are a band or solo performer
  - List of songs by the artist

- **Playlist Class:** Handles the collection of songs and provides the following functionalities:
  - Move to the next or previous song in the playlist.
  - Shuffle the playlist to randomize the order of songs.
